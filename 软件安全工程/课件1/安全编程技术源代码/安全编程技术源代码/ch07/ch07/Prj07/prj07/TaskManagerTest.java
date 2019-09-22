package prj07;

class TaskManager {
	private static TaskManager tm = new TaskManager();

	public static TaskManager getInstance() {
		return tm;
	}

	private TaskManager() {
		System.out.println("��������");
	}

	public void show() {
		System.out.println("��ʾ");
	}
}

public class TaskManagerTest {
	public static void main(String[] args) {
		TaskManager tm1 = TaskManager.getInstance();
		tm1.show();
		TaskManager tm2 = TaskManager.getInstance();
		tm2.show();
	}
}
