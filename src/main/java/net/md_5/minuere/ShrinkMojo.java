package net.md_5.minuere;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Mojo which strips jars of unrequired code.
 */
@Mojo(name = "shrink", defaultPhase = LifecyclePhase.PACKAGE)
public class ShrinkMojo extends AbstractMojo
{

    public void execute() throws MojoExecutionException, MojoFailureException
    {
        throw new UnsupportedOperationException( "Not supported yet." );
    }
}
