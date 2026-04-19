package jc;

import android.content.Context;
import io.flutter.embedding.engine.c;
import io.flutter.view.TextureRegistry;
import wc.i;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: jc.a$a, reason: collision with other inner class name */
    public interface InterfaceC0330a {
        String a(String str);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f14181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.flutter.embedding.engine.a f14182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sc.b f14183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TextureRegistry f14184d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final i f14185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InterfaceC0330a f14186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c f14187g;

        public b(Context context, io.flutter.embedding.engine.a aVar, sc.b bVar, TextureRegistry textureRegistry, i iVar, InterfaceC0330a interfaceC0330a, c cVar) {
            this.f14181a = context;
            this.f14182b = aVar;
            this.f14183c = bVar;
            this.f14184d = textureRegistry;
            this.f14185e = iVar;
            this.f14186f = interfaceC0330a;
            this.f14187g = cVar;
        }

        public Context a() {
            return this.f14181a;
        }

        public sc.b b() {
            return this.f14183c;
        }

        public InterfaceC0330a c() {
            return this.f14186f;
        }

        public i d() {
            return this.f14185e;
        }
    }

    void onAttachedToEngine(b bVar);

    void onDetachedFromEngine(b bVar);
}
