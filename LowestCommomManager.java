package test;

public class LowestCommomManager {

	public static void main(String[] args) {
		
		/**
		 * 
		 *                   e1
		 *                   /\
		 *                  /  \
		 *                 /    \
		 *                e2    e3
		 *                /\     /\
		 *               /  \   /  \
		 *              e4  e5  e6  e7
		 *                      /
		 *                     /
		 *                    e8  
		 */
		Employee e1 = new Employee("1", "jeff", null);
		
		Employee e2 = new Employee("2", "Chris", e1);
		
		Employee e3 = new Employee("3", "Alex", e1);
		
		Employee e4 = new Employee("4", "John", e2);
		
		Employee e5 = new Employee("5", "Smith", e2);
		
		Employee e6 = new Employee("6", "Tom", e3);
		
		Employee e7 = new Employee("7", "Kevin", e3);
		
		Employee e8 = new Employee("8", "Sean", e6);
		
		Employee e = findLowestCommonManager(e4, e6);
		
		System.out.println(e.getId() + "   " + e.getName());
		
        Employee m = findLowestCommonManager(e8, e7);
		
		System.out.println(m.getId() + "   " + m.getName());
 
	}

	private static Employee findLowestCommonManager(Employee e4, Employee e6) {
		
		Employee currentManager = e4.getManager();
	    Employee secondManager = e6.getManager();
	    boolean isMatchFound  = false;
		while (null != currentManager) {
			
			while(null != secondManager) {
				if (currentManager.getId().equals(secondManager.getId())) {
					isMatchFound = true;
					break;
				} else {
					secondManager = secondManager.getManager();
				}
			}
			if (isMatchFound) {
				return secondManager;
			} else {
				currentManager = currentManager.getManager();
				secondManager = e6.getManager();
			}
		}
		return null;
	}

}
