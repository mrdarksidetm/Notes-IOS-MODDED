package n2;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import n2.h0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AssetManager f15745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f15746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f15747k;

    private a(AssetManager assetManager, String str, i0 i0Var, int i10, h0.d dVar) {
        super(i0Var, i10, dVar, null);
        this.f15745i = assetManager;
        this.f15746j = str;
        h(f(null));
        this.f15747k = "asset:" + str;
    }

    public /* synthetic */ a(AssetManager assetManager, String str, i0 i0Var, int i10, h0.d dVar, ae.j jVar) {
        this(assetManager, str, i0Var, i10, dVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return ae.r.b(this.f15746j, aVar.f15746j) && ae.r.b(e(), aVar.e());
    }

    @Override // n2.i
    public Typeface f(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? w0.f15904a.a(this.f15745i, this.f15746j, context, e()) : Typeface.createFromAsset(this.f15745i, this.f15746j);
    }

    public int hashCode() {
        return (this.f15746j.hashCode() * 31) + e().hashCode();
    }

    public String toString() {
        return "Font(assetManager, path=" + this.f15746j + ", weight=" + b() + ", style=" + ((Object) e0.h(c())) + ')';
    }
}
