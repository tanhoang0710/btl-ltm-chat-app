
package swing;

import javax.swing.Icon;
import javax.swing.JProgressBar;

public class Progress extends JProgressBar {
    
    private ProgressType progressType = ProgressType.NON;

    public ProgressType getProgressType() {
        return progressType;
    }

    public void setProgressType(ProgressType progressType) {
        this.progressType = progressType;
        repaint();
    }
    
    
    public Progress() { 
        setOpaque(false);
        setUI(new ProgressCircleUI(this));
    }
    
    public static enum ProgressType{
        NON,DOWN_FILE, CANCEL, FILE
    }
}
