# k8s-example
* After a change in the application, an image will be automatically created according to the .github/workflows/docker-build.yaml file.
* This change will be detected in the kubernetes cluster and applied to the pods thanks to the synchronization of ArgoCD.
