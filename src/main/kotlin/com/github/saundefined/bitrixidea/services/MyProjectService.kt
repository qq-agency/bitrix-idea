package com.github.saundefined.bitrixidea.services

import com.intellij.openapi.project.Project
import com.github.saundefined.bitrixidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
