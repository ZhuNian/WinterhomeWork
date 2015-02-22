package org.nightschool;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.nightschool.controller.ItemController;

/**
 * Created by Administrator on 2015/2/20.
 */
public class HelloWorldApplication extends Application<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
        bootstrap.addBundle(new AssetsBundle("/assets", "/assets"));
    }

    @Override
    public void run(HelloWorldConfiguration configuration,
                    Environment environment) {
        // nothing to do yet
        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        ItemController itemController = new ItemController();
        environment.jersey().register(resource);
        environment.jersey().register(itemController);
    }
}
