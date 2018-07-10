package GoF.morePatterns.compositePattern.menu;

public abstract class MenuComponent {

	/*
	组合模式类似于数据结构中的树结构
	组合模式允许你将对象组合成树形结构来表现"整体/部分"层次结构.
	组合能让客户以一致的方式处理个别对象和对象组合
	 */
   
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
  
	public void print() {
		throw new UnsupportedOperationException();
	}
}
