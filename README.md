# Recipes for AGP version `8.2`
This branch contains recipes compatible with AGP 8.2. If you want to find recipes
for other AGP versions, switch to the corresponding `agp-*` branch.

This branch is read only. Contributions are only accepted on the `studio-main` branch. See `CONTRIBUTION.md`
there.
# Recipes Index
Index is organized in categories, offering different ways to reach the recipe you want.
## Themes
* Android Assets - [addGeneratedSourceFolder](addGeneratedSourceFolder), [legacyTaskBridging](legacyTaskBridging)
* Android Manifest - [transformManifest](transformManifest), [createSingleArtifact](createSingleArtifact), [perVariantManifestPlaceholder](perVariantManifestPlaceholder)
* Artifact API - [getMultipleArtifact](getMultipleArtifact), [transformAllClasses](transformAllClasses), [transformManifest](transformManifest), [getSingleArtifact](getSingleArtifact), [addMultipleArtifact](addMultipleArtifact), [createSingleArtifact](createSingleArtifact), [transformDirectory](transformDirectory), [workerEnabledTransformation](workerEnabledTransformation), [appendToMultipleArtifact](appendToMultipleArtifact), [appendToScopedArtifacts](appendToScopedArtifacts), [getScopedArtifacts](getScopedArtifacts)
* DSL - [addBuildTypeUsingDslFinalize](addBuildTypeUsingDslFinalize), [extendingAgp](extendingAgp)
* Dependency Resolution - [variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* Sources - [addGeneratedSourceFolder](addGeneratedSourceFolder), [legacyTaskBridging](legacyTaskBridging), [addCustomSourceType](addCustomSourceType)
## Plugin Features
* TestFixtures - [testFixtures](testFixtures)
## APIs
* AndroidComponentsExtension.beforeVariants() - [selectVariants](selectVariants)
* AndroidComponentsExtension.onVariants() - [addGeneratedSourceFolder](addGeneratedSourceFolder), [getMultipleArtifact](getMultipleArtifact), [transformAllClasses](transformAllClasses), [transformManifest](transformManifest), [legacyTaskBridging](legacyTaskBridging), [allProjectsApkAction](allProjectsApkAction), [asmTransformClasses](asmTransformClasses), [addCustomBuildConfigFields](addCustomBuildConfigFields), [getSingleArtifact](getSingleArtifact), [addMultipleArtifact](addMultipleArtifact), [createSingleArtifact](createSingleArtifact), [variantOutput](variantOutput), [transformDirectory](transformDirectory), [workerEnabledTransformation](workerEnabledTransformation), [appendToMultipleArtifact](appendToMultipleArtifact), [onVariants](onVariants), [perVariantManifestPlaceholder](perVariantManifestPlaceholder), [addCustomSourceType](addCustomSourceType), [appendToScopedArtifacts](appendToScopedArtifacts), [getScopedArtifacts](getScopedArtifacts), [variantDependencySubstitutionTest](variantDependencySubstitutionTest), [extendingAgp](extendingAgp)
* AndroidComponentsExtension.registerExtension() - [extendingAgp](extendingAgp)
* AndroidComponentsExtension.selector() - [selectVariants](selectVariants), [allProjectsApkAction](allProjectsApkAction), [variantOutput](variantOutput)
* ApplicationVariant.applicationId - [onVariants](onVariants)
* ApplicationVariant.outputs - [variantOutput](variantOutput)
* ArtifactTransformationRequest - [workerEnabledTransformation](workerEnabledTransformation)
* Artifacts.add() - [addMultipleArtifact](addMultipleArtifact)
* Artifacts.forScope() - [transformAllClasses](transformAllClasses), [appendToScopedArtifacts](appendToScopedArtifacts), [getScopedArtifacts](getScopedArtifacts)
* Artifacts.get() - [addGeneratedSourceFolder](addGeneratedSourceFolder), [transformManifest](transformManifest), [legacyTaskBridging](legacyTaskBridging), [allProjectsApkAction](allProjectsApkAction), [getSingleArtifact](getSingleArtifact), [addMultipleArtifact](addMultipleArtifact), [variantOutput](variantOutput), [transformDirectory](transformDirectory), [appendToMultipleArtifact](appendToMultipleArtifact), [perVariantManifestPlaceholder](perVariantManifestPlaceholder)
* Artifacts.getAll() - [getMultipleArtifact](getMultipleArtifact)
* Artifacts.use() - [transformManifest](transformManifest), [createSingleArtifact](createSingleArtifact), [transformDirectory](transformDirectory), [workerEnabledTransformation](workerEnabledTransformation), [appendToMultipleArtifact](appendToMultipleArtifact)
* BuildConfigField() - [addCustomBuildConfigFields](addCustomBuildConfigFields)
* BuiltArtifact - [workerEnabledTransformation](workerEnabledTransformation)
* CanMinifyAndroidResourcesBuilder.shrinkResources - [selectVariants](selectVariants)
* CanMinifyCodeBuilder.isMinifyEnabled - [selectVariants](selectVariants)
* Component.artifacts - [addGeneratedSourceFolder](addGeneratedSourceFolder), [getMultipleArtifact](getMultipleArtifact), [transformManifest](transformManifest), [legacyTaskBridging](legacyTaskBridging), [addMultipleArtifact](addMultipleArtifact), [createSingleArtifact](createSingleArtifact), [variantOutput](variantOutput), [transformDirectory](transformDirectory), [appendToMultipleArtifact](appendToMultipleArtifact), [appendToScopedArtifacts](appendToScopedArtifacts), [getScopedArtifacts](getScopedArtifacts)
* Component.compileConfiguration - [variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* Component.runtimeConfiguration - [variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* Component.sources - [addGeneratedSourceFolder](addGeneratedSourceFolder), [legacyTaskBridging](legacyTaskBridging), [addCustomSourceType](addCustomSourceType)
* Configuration.resolutionStrategy - [variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* DslExtension.Builder.build() - [extendingAgp](extendingAgp)
* DslExtension.Builder.extendBuildTypeWith() - [extendingAgp](extendingAgp)
* DslExtension.Builder.extendProductFlavorWith() - [extendingAgp](extendingAgp)
* DslExtension.Builder.extendProjectWith() - [extendingAgp](extendingAgp)
* DslLifecycle.finalizeDsl() - [addBuildTypeUsingDslFinalize](addBuildTypeUsingDslFinalize)
* GeneratesApk.applicationId - [onVariants](onVariants)
* Gradle.beforeProject() - [allProjectsApkAction](allProjectsApkAction)
* HasUnitTestBuilder.enableUnitTest - [selectVariants](selectVariants)
* InAndOutDirectoryOperationRequest.toTransform() - [transformDirectory](transformDirectory)
* InAndOutDirectoryOperationRequest.toTransformMany() - [workerEnabledTransformation](workerEnabledTransformation)
* InAndOutFileOperationRequest.toTransform() - [transformManifest](transformManifest)
* Instrumentation.transformClassesWith() - [asmTransformClasses](asmTransformClasses)
* MapProperty.put() - [addCustomBuildConfigFields](addCustomBuildConfigFields), [perVariantManifestPlaceholder](perVariantManifestPlaceholder)
* MultipleArtifact.MULTIDEX_KEEP_PROGUARD - [getMultipleArtifact](getMultipleArtifact)
* MultipleArtifact.NATIVE_DEBUG_METADATA - [addMultipleArtifact](addMultipleArtifact), [appendToMultipleArtifact](appendToMultipleArtifact)
* OutOperationRequest.toAppendTo() - [appendToMultipleArtifact](appendToMultipleArtifact)
* OutOperationRequest.toCreate() - [createSingleArtifact](createSingleArtifact)
* Plugin<Settings> - [allProjectsApkAction](allProjectsApkAction)
* ResolutionStrategy.dependencySubstitution() - [variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* ScopedArtifact.CLASSES - [transformAllClasses](transformAllClasses), [asmTransformClasses](asmTransformClasses), [appendToScopedArtifacts](appendToScopedArtifacts), [getScopedArtifacts](getScopedArtifacts)
* ScopedArtifacts.Scope.ALL - [appendToScopedArtifacts](appendToScopedArtifacts), [getScopedArtifacts](getScopedArtifacts)
* ScopedArtifacts.Scope.PROJECT - [transformAllClasses](transformAllClasses), [asmTransformClasses](asmTransformClasses), [appendToScopedArtifacts](appendToScopedArtifacts), [getScopedArtifacts](getScopedArtifacts)
* ScopedArtifacts.use() - [transformAllClasses](transformAllClasses), [asmTransformClasses](asmTransformClasses), [appendToScopedArtifacts](appendToScopedArtifacts), [getScopedArtifacts](getScopedArtifacts)
* ScopedArtifactsOperation.toAppend() - [appendToScopedArtifacts](appendToScopedArtifacts)
* ScopedArtifactsOperation.toGet() - [asmTransformClasses](asmTransformClasses), [appendToScopedArtifacts](appendToScopedArtifacts), [getScopedArtifacts](getScopedArtifacts)
* ScopedArtifactsOperation.toTransform() - [transformAllClasses](transformAllClasses)
* SingleArtifact.APK - [allProjectsApkAction](allProjectsApkAction), [workerEnabledTransformation](workerEnabledTransformation)
* SingleArtifact.ASSETS - [addGeneratedSourceFolder](addGeneratedSourceFolder), [legacyTaskBridging](legacyTaskBridging), [transformDirectory](transformDirectory)
* SingleArtifact.BUNDLE - [getSingleArtifact](getSingleArtifact), [addMultipleArtifact](addMultipleArtifact), [appendToMultipleArtifact](appendToMultipleArtifact)
* SingleArtifact.MERGED_MANIFEST - [transformManifest](transformManifest), [createSingleArtifact](createSingleArtifact), [variantOutput](variantOutput), [perVariantManifestPlaceholder](perVariantManifestPlaceholder)
* SourceDirectories.addGeneratedSourceDirectory() - [addGeneratedSourceFolder](addGeneratedSourceFolder), [legacyTaskBridging](legacyTaskBridging), [addCustomSourceType](addCustomSourceType)
* SourceDirectories.addStaticSourceDirectory() - [addCustomSourceType](addCustomSourceType)
* TaskBasedOperation.wiredWith() - [createSingleArtifact](createSingleArtifact)
* TaskBasedOperation.wiredWithDirectories() - [transformDirectory](transformDirectory), [workerEnabledTransformation](workerEnabledTransformation)
* TaskBasedOperation.wiredWithFiles() - [transformManifest](transformManifest)
* TaskOutputs.upToDateWhen() - [transformManifest](transformManifest)
* TaskProvider.flatMap() - [createSingleArtifact](createSingleArtifact)
* TaskProvider.map() - [addCustomBuildConfigFields](addCustomBuildConfigFields)
* Variant.buildConfigFields - [addCustomBuildConfigFields](addCustomBuildConfigFields)
* Variant.components - [variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* Variant.manifestPlaceholders - [perVariantManifestPlaceholder](perVariantManifestPlaceholder)
* Variant.nestedComponents - [variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* VariantBuilder.minSdk - [selectVariants](selectVariants)
* VariantExtensionConfig - [extendingAgp](extendingAgp)
* VariantOutputConfiguration.OutputType.SINGLE - [variantOutput](variantOutput)
* VariantOutputConfiguration.outputType - [variantOutput](variantOutput)
* VariantSelector.all() - [selectVariants](selectVariants), [variantOutput](variantOutput)
* VariantSelector.withBuildType() - [selectVariants](selectVariants), [allProjectsApkAction](allProjectsApkAction), [variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* VariantSelector.withFlavor() - [selectVariants](selectVariants), [variantOutput](variantOutput)
* VariantSelector.withName() - [selectVariants](selectVariants)
* task.getOutputs() - [transformManifest](transformManifest)
## Call chains
* DslExtension.Builder().extendProjectWith().extendBuildTypeWith().extendProductFlavorWith().build() - [extendingAgp](extendingAgp)
* androidComponents.beforeVariants {} - [selectVariants](selectVariants)
* androidComponents.finalizeDsl {} - [addBuildTypeUsingDslFinalize](addBuildTypeUsingDslFinalize)
* androidComponents.onVariants {} - [addGeneratedSourceFolder](addGeneratedSourceFolder), [getMultipleArtifact](getMultipleArtifact), [transformAllClasses](transformAllClasses), [transformManifest](transformManifest), [legacyTaskBridging](legacyTaskBridging), [allProjectsApkAction](allProjectsApkAction), [asmTransformClasses](asmTransformClasses), [addCustomBuildConfigFields](addCustomBuildConfigFields), [getSingleArtifact](getSingleArtifact), [addMultipleArtifact](addMultipleArtifact), [createSingleArtifact](createSingleArtifact), [variantOutput](variantOutput), [transformDirectory](transformDirectory), [workerEnabledTransformation](workerEnabledTransformation), [appendToMultipleArtifact](appendToMultipleArtifact), [onVariants](onVariants), [perVariantManifestPlaceholder](perVariantManifestPlaceholder), [addCustomSourceType](addCustomSourceType), [appendToScopedArtifacts](appendToScopedArtifacts), [getScopedArtifacts](getScopedArtifacts), [variantDependencySubstitutionTest](variantDependencySubstitutionTest), [extendingAgp](extendingAgp)
* androidComponents.registerExtension() - [extendingAgp](extendingAgp)
* androidComponents.selector().all() - [selectVariants](selectVariants), [variantOutput](variantOutput)
* androidComponents.selector().withBuildType() - [selectVariants](selectVariants), [allProjectsApkAction](allProjectsApkAction), [variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* androidComponents.selector().withFlavor() - [selectVariants](selectVariants), [variantOutput](variantOutput)
* androidComponents.selector().withName() - [selectVariants](selectVariants)
* configuration.resolutionStrategy.dependencySubstitution {} - [variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* settings.gradle.beforeProject {} - [allProjectsApkAction](allProjectsApkAction)
* substitute().using() - [variantDependencySubstitutionTest](variantDependencySubstitutionTest)
* task.outputs.upToDateWhen {} - [transformManifest](transformManifest)
* transformationRequest.submit() - [workerEnabledTransformation](workerEnabledTransformation)
* variant.applicationId - [onVariants](onVariants)
* variant.artifacts.add() - [addMultipleArtifact](addMultipleArtifact)
* variant.artifacts.forScope().use().toAppend() - [appendToScopedArtifacts](appendToScopedArtifacts)
* variant.artifacts.forScope().use().toGet() - [asmTransformClasses](asmTransformClasses), [getScopedArtifacts](getScopedArtifacts)
* variant.artifacts.forScope().use().toTransform() - [transformAllClasses](transformAllClasses)
* variant.artifacts.get() - [addGeneratedSourceFolder](addGeneratedSourceFolder), [transformManifest](transformManifest), [legacyTaskBridging](legacyTaskBridging), [allProjectsApkAction](allProjectsApkAction), [asmTransformClasses](asmTransformClasses), [getSingleArtifact](getSingleArtifact), [addMultipleArtifact](addMultipleArtifact), [variantOutput](variantOutput), [transformDirectory](transformDirectory), [appendToMultipleArtifact](appendToMultipleArtifact), [perVariantManifestPlaceholder](perVariantManifestPlaceholder)
* variant.artifacts.getAll() - [getMultipleArtifact](getMultipleArtifact)
* variant.artifacts.use().wiredWith().toAppendTo() - [appendToMultipleArtifact](appendToMultipleArtifact)
* variant.artifacts.use().wiredWith().toCreate() - [createSingleArtifact](createSingleArtifact)
* variant.artifacts.use().wiredWithDirectories().toTransform() - [transformDirectory](transformDirectory)
* variant.artifacts.use().wiredWithDirectories().toTransformMany() - [workerEnabledTransformation](workerEnabledTransformation)
* variant.artifacts.use().wiredWithFiles().toTransform() - [transformManifest](transformManifest)
* variant.buildConfigFields.put() - [addCustomBuildConfigFields](addCustomBuildConfigFields)
* variant.instrumentation.transformClassesWith() - [asmTransformClasses](asmTransformClasses)
* variant.manifestPlaceholders.put() - [perVariantManifestPlaceholder](perVariantManifestPlaceholder)
* variant.sources.*.addGeneratedSourceDirectory() - [addGeneratedSourceFolder](addGeneratedSourceFolder), [legacyTaskBridging](legacyTaskBridging), [addCustomSourceType](addCustomSourceType)
* variant.sources.*.addStaticSourceDirectory() - [addCustomSourceType](addCustomSourceType)
* variant.sources.*.all - [addGeneratedSourceFolder](addGeneratedSourceFolder), [addCustomSourceType](addCustomSourceType)
## Others
* All projects - [allProjectsApkAction](allProjectsApkAction)
* Extending AGP DSL - [extendingAgp](extendingAgp)
* Legacy API bridging - [legacyTaskBridging](legacyTaskBridging)
* Placeholders - [perVariantManifestPlaceholder](perVariantManifestPlaceholder)
* SourceDirectories.Flat - [addCustomSourceType](addCustomSourceType)
* SourceDirectories.Layered - [addGeneratedSourceFolder](addGeneratedSourceFolder)
* SourceDirectories.add - [addCustomSourceType](addCustomSourceType)
* registerSourceType - [addCustomSourceType](addCustomSourceType)
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
