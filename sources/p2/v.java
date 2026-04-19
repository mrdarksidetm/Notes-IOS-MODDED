package p2;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
class v extends t {
    public v(InputConnection inputConnection, zd.a<md.i0> aVar) {
        super(inputConnection, aVar);
    }

    @Override // p2.s, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
