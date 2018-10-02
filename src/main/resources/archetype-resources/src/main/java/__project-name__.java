package ${package};

import lombok.extern.slf4j.Slf4j;

/**
 * Entrypoint for ${project-name}.
 */
@Slf4j
@SuppressWarnings("uncommentedmain")
public final class ${project-name} {

    /**
     * Prevent instantiation of utility class.
     */
    private ${project-name}() { }

    /**
     * Java entrypoint.
     * @param args command line arguments.
     */
    public static void main(final String[] args) {

        log.info("Application started successfully with args {}",
                (Object[]) args);

    }

}
