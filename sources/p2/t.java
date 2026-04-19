package p2;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
class t extends s {
    public t(InputConnection inputConnection, zd.a<md.i0> aVar) {
        super(inputConnection, aVar);
    }

    @Override // p2.s
    protected final void b(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.getHandler();
        }
        return null;
    }
}
