minikube delete
minikube start --cpus 5 --memory 7900 --container-runtime=docker
kubectl create namespace apk

current_dir=$PWD

# config-deployer
cd $current_dir
cd runtime/config-deployer-service
./gradlew build

# adapter
cd $current_dir
cd adapter
./gradlew build

# cc
cd $current_dir
cd common-controller
./gradlew build

# # apkBase
# cd $current_dir
# cd apkBase
# ./gradlew build

# # common-bal-libs
# cd $current_dir
# cd common-bal-libs
# ./gradlew build

# # router
# cd $current_dir
# cd gateway/router
# ./gradlew build

# enforcer
cd $current_dir
cd gateway/enforcer
./gradlew build

# # ratelimiter
# cd $current_dir
# cd ratelimiter
# ./gradlew build

# # idp-domain-service
# cd $current_dir
# cd idp/idp-domain-service
# ./gradlew build

# # idp-ui
# cd $current_dir
# cd idp/idp-ui
# ./gradlew build

# # backoffice
# cd $current_dir
# cd backoffice/backoffice-domain-service
# ./gradlew build

# # devportal
# cd $current_dir
# cd devportal/devportal-domain-service
# ./gradlew build

# # devportal ui
# cd $current_dir
# cd devportal/devportal-ui
# ./gradlew build

helm uninstall apk -n apk
cd $current_dir
cd helm-charts/crds
kubectl apply -f .
kubectl apply -f . -n apk
echo "CRD Changes applied. Loading minikube images"

minikube image load apk-config-deployer-service:1.1.0-SNAPSHOT
minikube image load apk-adapter:1.1.0-SNAPSHOT
# minikube image load apk-ratelimiter:1.0.0-SNAPSHOT
# minikube image load apk-idp-ui:1.0.0-SNAPSHOT
# minikube image load apk-idp-domain-service:1.0.0-SNAPSHOT
minikube image load apk-enforcer:1.1.0-SNAPSHOT
# minikube image load apk-router:1.0.0-SNAPSHOT
minikube image load apk-common-controller:1.1.0-SNAPSHOT
# minikube image load apk-backoffice-domain-service:0.0.1-SNAPSHOT
# minikube image load apk-management-server:0.0.1-SNAPSHOT
# minikube image load apk-admin-domain-service:0.0.1-SNAPSHOT
# minikube image load apk-devportal-domain-service:0.0.1-SNAPSHOT

echo "Completed loading minikube images. Installing helm charts"

cd $current_dir
cd helm-charts
helm dependency build
helm install apk . -n apk
echo "Completed installing helm charts"

echo "Current status of pods:"
kubectl get pods -n apk -w
echo "Starting port forwarding"
# kubectl port-forward svc/apk-wso2-apk-gateway-service -n apk 9095:9095
