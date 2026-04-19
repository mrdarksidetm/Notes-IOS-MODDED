package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.b;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import u8.n;
import v8.h;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class a<O extends d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0174a f8396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f8397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8398c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0174a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, w8.c cVar, O o10, e.b bVar, e.c cVar2) {
            return (T) buildClient(context, looper, cVar, (Object) o10, (v8.d) bVar, (h) cVar2);
        }

        public T buildClient(Context context, Looper looper, w8.c cVar, O o10, v8.d dVar, h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {
        public static final c N = new c(null);

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0175a extends d {
            Account r();
        }

        public interface b extends d {
            GoogleSignInAccount n();
        }

        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(n nVar) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(O o10) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return API_PRIORITY_OTHER;
        }
    }

    public interface f extends b {
        void connect(b.c cVar);

        void disconnect();

        void disconnect(String str);

        t8.d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.f fVar, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(b.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, AbstractC0174a<C, O> abstractC0174a, g<C> gVar) {
        m.l(abstractC0174a, "Cannot construct an Api with a null ClientBuilder");
        m.l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f8398c = str;
        this.f8396a = abstractC0174a;
        this.f8397b = gVar;
    }

    public final AbstractC0174a a() {
        return this.f8396a;
    }

    public final c b() {
        return this.f8397b;
    }

    public final String c() {
        return this.f8398c;
    }
}
