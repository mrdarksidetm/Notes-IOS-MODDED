package me;

import android.os.Looper;
import java.util.List;
import le.m2;
import qe.v;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements v {
    @Override // qe.v
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // qe.v
    public m2 b(List<? extends v> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(f.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // qe.v
    public int c() {
        return 1073741823;
    }
}
