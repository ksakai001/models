package messagetest.testinterface;

import com.mentor.nucleus.bp.core.ComponentInstance_c;

public interface IJarredTestReplyFromProvider {
	public void replyToProvider(ComponentInstance_c senderReceiver, String senderName);
	public void simpleOp(ComponentInstance_c senderReceiver);
	public void simpleSig(ComponentInstance_c senderReceiver);
}
