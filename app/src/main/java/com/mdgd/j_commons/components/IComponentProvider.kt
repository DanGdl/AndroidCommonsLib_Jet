package com.mdgd.j_commons.components

import com.mdgd.j_commons.components.repo.IRepo

interface IComponentProvider {
    fun getRepo(): IRepo

}
