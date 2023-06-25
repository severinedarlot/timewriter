package com.sdarlot.timewriter;

import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class MyCommands {

	@ShellMethod(key = "hello-world", value = "Display Hello world")
	public String helloWorld(
		@ShellOption(defaultValue = "spring") String arg
	) {
		return "Hello world " + arg;
	}
}
