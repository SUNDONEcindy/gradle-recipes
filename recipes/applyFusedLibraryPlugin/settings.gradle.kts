/*
 * Copyright (C) 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

rootProject.name = "fused-library-samples"

pluginManagement {
    repositories {
        $AGP_REPOSITORY
        $PLUGIN_REPOSITORIES
        maven(url = uri("${rootProject.projectDir}/fusedLibrary/build/repo"))
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        $AGP_REPOSITORY
        $DEPENDENCY_REPOSITORIES
        maven(url = uri("${rootProject.projectDir}/fusedLibrary/build/repo"))
    }
}

include(":app")
include(":fusedLibrary")
include(":androidLib1")
include(":androidLib2")
include(":androidLib3")
