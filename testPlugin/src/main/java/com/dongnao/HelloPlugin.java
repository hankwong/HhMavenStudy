package com.dongnao;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * @author autohome-hank
 * @version v1.0.0
 * @date 2020/7/7
 * @time 上午10:37
 * @desc 自定义第一个maven插件
 */
@Mojo(name = "helloPlugin")
/**表示该Mojo对应的goal的名字为helloPlugin，在调用该goal时需要给出它的名字*/
public class HelloPlugin extends AbstractMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello plugin-----------------");
    }
}
