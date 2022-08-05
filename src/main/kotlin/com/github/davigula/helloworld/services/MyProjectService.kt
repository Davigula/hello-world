package com.github.davigula.helloworld.services

import com.intellij.openapi.project.Project
import com.github.davigula.helloworld.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
