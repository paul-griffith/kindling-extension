package io.github.paulgriffith.extras

import com.formdev.flatlaf.extras.FlatSVGIcon
import io.github.paulgriffith.kindling.core.Tool
import io.github.paulgriffith.kindling.core.ToolPanel
import java.nio.file.Path
import javax.swing.Icon

object MyTool : Tool {
    override val description: String = "desc"
    override val extensions: List<String> = listOf("ext")
    override val icon: FlatSVGIcon = FlatSVGIcon("")
    override val title: String = "title"

    override fun open(path: Path): ToolPanel {
        return object : ToolPanel() {
            override val icon: Icon? = null
        }
    }
}

class MyToolProxy : Tool by MyTool
