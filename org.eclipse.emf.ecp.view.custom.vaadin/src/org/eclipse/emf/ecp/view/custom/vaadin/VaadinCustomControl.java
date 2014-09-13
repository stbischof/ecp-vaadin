package org.eclipse.emf.ecp.view.custom.vaadin;

import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.custom.model.VCustomControl;

import com.vaadin.ui.Component;

public interface VaadinCustomControl extends Component {

	void renderCustomControl(VCustomControl customControl, ViewModelContext viewModelContext);

}
