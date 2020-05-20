package java_14_InnerClass.one;

/**
 * @author kiran dalai
 *
 */
public class Button {
	private String title;
	private onclicklistener onClicklistner;

	public Button(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
//	public void setonclicklistner(onclicklistener onclicklistener) {
//		this.onClicklistner.onclick(this.title);
//	}
	public void setonclicklister(onclicklistener onclicklisterer) {
		this.onClicklistner=onclicklisterer;
	}

	public onclicklistener getOnClicklistner() {
		return onClicklistner;
	}

	public void onclick() {
		this.onClicklistner.onclick(this.title);
	}
	public interface onclicklistener{
		public void onclick(String title);
	}

}
