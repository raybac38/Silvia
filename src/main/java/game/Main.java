package game;

import engine.component.Mesh;
import engine.core.Render;
import engine.core.Scene;
import engine.core.window.GlfwWindow;
import engine.core.window.Window;
import engine.entity.Entity;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {

		Window window = new GlfwWindow();
		Render render = new Render(window);

		Scene scene = new Scene(render);


		System.out.println("HEY");

		Entity bloc = new Entity(scene);
		bloc.addComponent(new Mesh(bloc));

		while (true) {
			render.render();
			window.update();
		}
	}
}