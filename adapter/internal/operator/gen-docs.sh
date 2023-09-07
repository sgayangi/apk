#!/bin/bash

# Copyright 2020 The Kubernetes Authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -o errexit
set -o nounset
set -o pipefail

GOPATH=${GOPATH:-$(go env GOPATH)}

# "go env" doesn't print anything if GOBIN is the default, so we
# have to manually default it.
GOBIN=${GOBIN:-$(go env GOBIN)}
GOBIN=${GOBIN:-${GOPATH}/bin}

readonly HERE=$(cd $(dirname $0) && pwd)
readonly REPO=$(cd ${HERE}/../.. && pwd)

gendoc::build() {
    go install github.com/ahmetb/gen-crd-api-reference-docs
}

gendoc::exec() {
    local gofile="$1"
    local outfile="$2"
    local readonly confdir="${REPO}/api-docs"

    # Ensure that the gofile and outfile are set and not empty
    if [[ -z "$gofile" || -z "$outfile" ]]; then
        echo "Error: Missing arguments for gendoc::exec"
        exit 1
    fi

    ${GOBIN}/gen-crd-api-reference-docs \
        -template-dir ${confdir} \
        -config ${confdir}/config.json \
        -api-dir "github.com/wso2/apk/adapter/internal/operator/apis/dp/v1alpha1" \
        -out-file "${outfile}" \
        -v 10
}

if [ "$#" != "2" ]; then
    echo "usage: gen-docs.sh GOFILE OUTFILE"
    exit 2
fi

gofile="$1"
outfile="$2"
# gendoc::build
gendoc::exec "$gofile" "$outfile"
