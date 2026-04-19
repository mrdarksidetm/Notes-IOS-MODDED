package kc;

import android.app.Activity;
import android.os.Bundle;
import sc.l;
import sc.n;

/* JADX INFO: loaded from: classes2.dex */
public interface c {

    public interface a {
        void a(Bundle bundle);

        void b(Bundle bundle);
    }

    void a(n nVar);

    void b(l lVar);

    void c(n nVar);

    void d(l lVar);

    Activity getActivity();

    Object getLifecycle();
}
