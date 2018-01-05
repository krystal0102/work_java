package inheritance.abstractinterface;

public class InterfaceTest {
	public static void main(String[] args) {
		
		Device pdev[] = { new HPPprinter(), new USBMemory()};
						// 배열이 디바이스로 만들어졌기 때문에 각 인자들은 디바이스의 시점임
		pdev[0].print();
		pdev[1].print();
		
		((Connectable)pdev[0]).connect(); // pdev[0].connect() 불가능
										  // 배열이 디바이스로 만들어졌기 때문에 각 인자들은 디바이스의 시점임
										  // 따라서 디바이스엔 커넥트가 없어서 위와 같이 호출할 수 없음
		
		((Connectable)pdev[1]).connect(); // pdev[0].connect() 불가능
		// pdev를 커넥터블로 바꿔주고 커넥트를 호출하게 되면 커넥터블은 커넥트가 있기 때문에 호출이 가능해짐
	}

}
