# Recipes for AGP version `8.4.0-alpha01`
This branch contains recipes compatible with AGP 8.4.0-alpha01. If you want to find recipes
for other AGP versions, switch to the corresponding `agp-*` branch.

This branch is read only. Contributions are only accepted on the `studio-main` branch. See `CONTRIBUTION.md`
there.
# Recipes Index
* All projects - 
[allProjectsApkAction](allProjectsApkAction)
* AndroidComponentsExtension.beforeVariants - 
[selectVariants](selectVariants)
* AndroidComponentsExtension.onVariants - 
[onVariants](onVariants)
* AndroidComponentsExtension.selector - 
[selectVariants](selectVariants)
* BuildConfig - 
[addCustomBuildConfigFields](addCustomBuildConfigFields)
* Component.compileConfiguration - 
[variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* Component.runtimeConfiguration - 
[variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* Configuration.resolutionStrategy - 
[variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* Manifest API - 
[createSingleArtifact](createSingleArtifact), [perVariantManifestPlaceholder](perVariantManifestPlaceholder)
* MultipleArtifact - 
[addMultipleArtifact](addMultipleArtifact), [getMultipleArtifact](getMultipleArtifact), [appendToMultipleArtifact](appendToMultipleArtifact)
* MultipleArtifact.MULTIDEX_KEEP_PROGUARD - 
[getMultipleArtifact](getMultipleArtifact)
* MultipleArtifact.NATIVE_DEBUG_METADATA - 
[addMultipleArtifact](addMultipleArtifact), [appendToMultipleArtifact](appendToMultipleArtifact)
* OutOperationRequest.toAppendTo() - 
[appendToMultipleArtifact](appendToMultipleArtifact)
* OutOperationRequest.toCreate - 
[createSingleArtifact](createSingleArtifact)
* Placeholders - 
[perVariantManifestPlaceholder](perVariantManifestPlaceholder)
* ResolutionStrategy.dependencySubstitution - 
[variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* ScopedArtifact.CLASSES - 
[transformAllClasses](transformAllClasses), [getScopedArtifacts](getScopedArtifacts)
* ScopedArtifacts.Scope.ALL - 
[getScopedArtifacts](getScopedArtifacts)
* ScopedArtifacts.Scope.PROJECT - 
[transformAllClasses](transformAllClasses), [getScopedArtifacts](getScopedArtifacts)
* ScopedArtifactsOperation.toTransform() - 
[transformAllClasses](transformAllClasses)
* SingleArtifact.APK - 
[allProjectsApkAction](allProjectsApkAction)
* SingleArtifact.BUNDLE - 
[addMultipleArtifact](addMultipleArtifact), [getSingleArtifact](getSingleArtifact), [appendToMultipleArtifact](appendToMultipleArtifact)
* SingleArtifact.MERGED_MANIFEST - 
[createSingleArtifact](createSingleArtifact), [perVariantManifestPlaceholder](perVariantManifestPlaceholder)
* SourceDirectories.add - 
[addCustomSourceFolders](addCustomSourceFolders)
* TaskBasedOperation.wiredWith(taskOutput) - 
[createSingleArtifact](createSingleArtifact)
* Variant.nestedComponents - 
[variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* VariantSelector.withBuildType - 
[selectVariants](selectVariants)
* VariantSelector.withFlavor - 
[selectVariants](selectVariants)
* VariantSelector.withName - 
[selectVariants](selectVariants)
* WorkAction - 
[workerEnabledTransformation](workerEnabledTransformation)
* addGeneratedSourceDirectory - 
[addCustomAsset](addCustomAsset), [addCustomSourceFolders](addCustomSourceFolders)
* addStaticSourceDirectory - 
[addCustomSourceFolders](addCustomSourceFolders)
* artifacts.getBuiltArtifactsLoader - 
[transformManifest](transformManifest)
* asset - 
[addCustomAsset](addCustomAsset)
* extending AGP DSL - 
[extendingAgp](extendingAgp)
* finalizeDsl - 
[addBuildTypeUsingDslFinalize](addBuildTypeUsingDslFinalize)
* from Task - 
[addCustomBuildConfigFields](addCustomBuildConfigFields)
* onVariant - 
[addMultipleArtifact](addMultipleArtifact), [getMultipleArtifact](getMultipleArtifact), [createSingleArtifact](createSingleArtifact), [addCustomSourceFolders](addCustomSourceFolders), [allProjectsApkAction](allProjectsApkAction), [extendingAgp](extendingAgp), [addCustomBuildConfigFields](addCustomBuildConfigFields), [getSingleArtifact](getSingleArtifact), [getScopedArtifacts](getScopedArtifacts), [perVariantManifestPlaceholder](perVariantManifestPlaceholder), [appendToMultipleArtifact](appendToMultipleArtifact)
* outputs.upToDateWhen - 
[transformManifest](transformManifest)
* registerSourceType - 
[addCustomSourceFolders](addCustomSourceFolders)
* settings plugin - 
[allProjectsApkAction](allProjectsApkAction), [extendingAgp](extendingAgp)
* toTransform - 
[transformManifest](transformManifest)
* toTransformMany - 
[workerEnabledTransformation](workerEnabledTransformation)
* transformationRequest - 
[workerEnabledTransformation](workerEnabledTransformation)
* variant.applicationId - 
[onVariants](onVariants)
* variant.artifacts.add - 
[addMultipleArtifact](addMultipleArtifact)
* variant.artifacts.forScope - 
[transformAllClasses](transformAllClasses), [getScopedArtifacts](getScopedArtifacts)
* variant.artifacts.get - 
[addMultipleArtifact](addMultipleArtifact), [allProjectsApkAction](allProjectsApkAction), [getSingleArtifact](getSingleArtifact), [transformManifest](transformManifest), [appendToMultipleArtifact](appendToMultipleArtifact)
* variant.artifacts.getAll - 
[getMultipleArtifact](getMultipleArtifact)
* variant.artifacts.use - 
[appendToMultipleArtifact](appendToMultipleArtifact)
* wiredWithDirectories - 
[workerEnabledTransformation](workerEnabledTransformation)
* wiredWithFiles - 
[transformManifest](transformManifest)
# License
```
Copyright 2022 The Android Open Source Project

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
