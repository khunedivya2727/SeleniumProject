package AbstractionEx;

public class RunAbstractEx extends AbstractionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunAbstractEx obj=new RunAbstractEx();
		obj.NormalMethod();
		obj.abstractmethod();
		
	}
		
		@Override
		public void abstractmethod() {
			System.out.println("Abstract method");
		}
	

}
