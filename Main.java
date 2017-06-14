/**
 * 反射
 * 反射是让程序拥有在运行时解析类的能力
 * 
 * 反射是对类的面向对象
 * 
 * 属性
 * 方法
 * 构造器
 * 
 * 获得Class对象的3种方式：
 * 类名.class
 * 对象.getClass();
 * Class.forName("包名.类名");
 * 
 * @author dj
 *
 */
public class Main {
	public static void main(String[] args) throws ClassNotFoundException {
		Person p = new Person();
		p.setName("张三");
		p.setAddress("深圳");
		p.setAge(16);
		System.out.println(p.toString());
		
		
		Student s = new Student();
		s.setName("小明");
		s.setClassno(1);
		s.setSno(16);
		System.out.println(s.toString());
		
		
//		Class c = Person.class;
		
		//通过反射获得Person类中的所有共有属性
//		Field[] field = c.getFields();
//		for(Field f : field){
//			System.out.println(f.getName());
//		}
		
		//通过反射获得Person类中的私有属性
		Field[] fields = c.getDeclaredFields();
		for(Field f : fields){
			 f.setAccessible(true);//开启访问私有的权
			System.out.println(f.getName());
		}
		
		//通过反射获得Person类中的行为
		Method[] methods = c.getMethods();
		for(Method m : methods){
			System.out.println(m.getName());
		}
		
		通过反射获得Person类中的构造器
		Constructor[] cs = c.getConstructors();
	}
	https://github.com/distantcat/learn_git.git
}
