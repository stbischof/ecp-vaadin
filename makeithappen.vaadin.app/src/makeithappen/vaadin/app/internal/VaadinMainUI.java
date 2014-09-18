package makeithappen.vaadin.app.internal;

import com.eclipsesource.makeithappen.model.task.TaskFactory;
import com.eclipsesource.makeithappen.model.task.User;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@PreserveOnRefresh
@Theme(ValoTheme.THEME_NAME)
// @Theme(Reindeer.THEME_NAME)
public class VaadinMainUI extends UI {

	private static final long serialVersionUID = 1L;
	final static User user = TaskFactory.eINSTANCE.createUser();

	@Override
	protected void init(VaadinRequest request) {
		getPage().setTitle("Test Vaadin Valo");

		// VaadinObservables.activateRealm(UI.getCurrent());
		// ECPVaadinView ecpVaadinView = ECPFVaadinViewRenderer.INSTANCE.render(user);
		// setContent(ecpVaadinView.getComponent());
		//
		// EContentAdapter adapter = new EContentAdapter() {
		// @Override
		// public void notifyChanged(Notification notification) {
		// System.out.println(user);
		// }
		// };
		// user.eAdapters().add(adapter);

		VerticalLayout verticalLayout = new VerticalLayout();
		verticalLayout.setSizeFull();
		verticalLayout.setMargin(true);
		verticalLayout.setSpacing(true);

		VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		layout.setSpacing(true);
		for (int i = 0; i < 20; i++) {
			layout.addComponent(new TextField("" + i));
		}

		verticalLayout.addComponent(layout);
		setContent(verticalLayout);
		setResizeLazy(true);
		setPollInterval(1000);
	}

	@Override
	protected void refresh(VaadinRequest request) {
	}
}