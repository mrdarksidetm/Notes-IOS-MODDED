package e7;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DevicePolicyManager f10677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KeyguardManager f10678b;

    static final class a extends ae.s implements zd.a<String> {
        a() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            DevicePolicyManager devicePolicyManager = n.this.f10677a;
            return o.b(devicePolicyManager != null ? Integer.valueOf(devicePolicyManager.getStorageEncryptionStatus()) : null);
        }
    }

    static final class b extends ae.s implements zd.a<Boolean> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            KeyguardManager keyguardManager = n.this.f10678b;
            return Boolean.valueOf(keyguardManager != null ? keyguardManager.isKeyguardSecure() : false);
        }
    }

    static final class c extends ae.s implements zd.a<List<? extends md.s<? extends String, ? extends String>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f10681a = new c();

        c() {
            super(0);
        }

        @Override // zd.a
        public final List<? extends md.s<? extends String, ? extends String>> invoke() {
            Provider[] providers = Security.getProviders();
            ae.r.e(providers, "getProviders()");
            ArrayList arrayList = new ArrayList(providers.length);
            for (Provider provider : providers) {
                String name = provider.getName();
                String info = provider.getInfo();
                if (info == null) {
                    info = "";
                } else {
                    ae.r.e(info, "it.info ?: \"\"");
                }
                arrayList.add(new md.s(name, info));
            }
            return arrayList;
        }
    }

    public n(DevicePolicyManager devicePolicyManager, KeyguardManager keyguardManager) {
        this.f10677a = devicePolicyManager;
        this.f10678b = keyguardManager;
    }

    @Override // e7.m
    public String a() {
        return (String) g7.a.a(new a(), "");
    }

    @Override // e7.m
    public List<md.s<String, String>> b() {
        return (List) g7.a.a(c.f10681a, nd.u.m());
    }

    @Override // e7.m
    public boolean c() {
        return ((Boolean) g7.a.a(new b(), Boolean.FALSE)).booleanValue();
    }
}
