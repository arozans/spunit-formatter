package com.github.arozans.spunitformatter.services

import com.intellij.openapi.project.Project
import com.github.arozans.spunitformatter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
