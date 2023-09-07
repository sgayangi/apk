# Build the documentation.
TYPES_FOLDER = ./internal/operator/apis/dp/v1alpha1/
EXTENSION = .go

.PHONY: docs
docs:
	@cd $(TYPES_FOLDER) && for gofile in *$(EXTENSION); do \
		dir_name=$$(basename $$gofile .go); \
		outfile=../../../../docs/$$dir_name.md; \
        mkdir -p $$dir_name; \
        mv $$gofile $$dir_name/; \
        mv doc.go $$dir_name/; \
        cd $$dir_name;\
		../../../../gen-docs.sh $$gofile $$outfile; \
        mv $$gofile ../; \
        cd $$dir_name;\
        mv doc.go ../; \
        cd .. && rmdir $$dir_name;  \
    done