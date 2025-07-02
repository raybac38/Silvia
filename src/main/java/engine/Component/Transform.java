package engine.Component;

import utils.vector.Vector3;

public class Transform extends BaseComponent {
	private Vector3 position;

	public void translate(Vector3 translation) {
		this.position = position.add(translation);
	}

	public void setPosition(Vector3 newPosition) {
		this.position = newPosition;
	}
}
