package h6;

import android.graphics.Bitmap;
import h6.c;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f11832a;

    public a(i iVar) {
        this.f11832a = iVar;
    }

    @Override // h6.h
    public c.C0289c a(c.b bVar) {
        return null;
    }

    @Override // h6.h
    public void b(int i10) {
    }

    @Override // h6.h
    public void c(c.b bVar, Bitmap bitmap, Map<String, ? extends Object> map) {
        this.f11832a.c(bVar, bitmap, map, o6.a.a(bitmap));
    }
}
