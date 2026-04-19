package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements y4.a<o4.e> {
    @Override // y4.a
    public List<Class<? extends y4.a<?>>> a() {
        return nd.u.m();
    }

    @Override // y4.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o4.e b(Context context) {
        ae.r.f(context, "context");
        androidx.startup.a aVarE = androidx.startup.a.e(context);
        ae.r.e(aVarE, "getInstance(context)");
        if (!aVarE.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        h.a(context);
        n.b bVar = n.f4358i;
        bVar.b(context);
        return bVar.a();
    }
}
