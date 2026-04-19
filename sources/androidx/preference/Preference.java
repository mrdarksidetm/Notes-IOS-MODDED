package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import f3.j;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    private int A;
    private int B;
    private b C;
    private List<Preference> D;
    private e E;
    private final View.OnClickListener F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f4439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f4440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f4443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f4444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f4446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Intent f4447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f4448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f4449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4450m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f4452o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Object f4453p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f4454q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f4455r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f4456s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f4457t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f4458u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f4459v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f4460w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f4461x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f4462y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f4463z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.E(view);
        }
    }

    interface b {
        void a(Preference preference);
    }

    public interface c {
        boolean a(Preference preference, Object obj);
    }

    public interface d {
        boolean a(Preference preference);
    }

    public interface e<T extends Preference> {
        CharSequence a(T t10);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, u4.c.f21622g, R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x00c7 A[PHI: r7
  0x00c7: PHI (r7v41 int) = (r7v29 int), (r7v30 int) binds: [B:3:0x00c5, B:6:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Preference(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public void A(Preference preference, boolean z10) {
        if (this.f4454q == z10) {
            this.f4454q = !z10;
            y(J());
            x();
        }
    }

    protected Object B(TypedArray typedArray, int i10) {
        return null;
    }

    public void C(Preference preference, boolean z10) {
        if (this.f4455r == z10) {
            this.f4455r = !z10;
            y(J());
            x();
        }
    }

    public void D() {
        if (v() && w()) {
            z();
            d dVar = this.f4440c;
            if (dVar == null || !dVar.a(this)) {
                q();
                if (this.f4447j != null) {
                    c().startActivity(this.f4447j);
                }
            }
        }
    }

    protected void E(View view) {
        D();
    }

    protected boolean F(boolean z10) {
        if (!K()) {
            return false;
        }
        if (z10 == m(!z10)) {
            return true;
        }
        p();
        throw null;
    }

    protected boolean G(int i10) {
        if (!K()) {
            return false;
        }
        if (i10 == n(~i10)) {
            return true;
        }
        p();
        throw null;
    }

    protected boolean H(String str) {
        if (!K()) {
            return false;
        }
        if (TextUtils.equals(str, o(null))) {
            return true;
        }
        p();
        throw null;
    }

    public final void I(e eVar) {
        this.E = eVar;
        x();
    }

    public boolean J() {
        return !v();
    }

    protected boolean K() {
        return false;
    }

    public boolean a(Object obj) {
        c cVar = this.f4439b;
        return cVar == null || cVar.a(this, obj);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i10 = this.f4441d;
        int i11 = preference.f4441d;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f4443f;
        CharSequence charSequence2 = preference.f4443f;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f4443f.toString());
    }

    public Context c() {
        return this.f4438a;
    }

    StringBuilder i() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequenceT = t();
        if (!TextUtils.isEmpty(charSequenceT)) {
            sb2.append(charSequenceT);
            sb2.append(' ');
        }
        CharSequence charSequenceR = r();
        if (!TextUtils.isEmpty(charSequenceR)) {
            sb2.append(charSequenceR);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    public String j() {
        return this.f4448k;
    }

    public Intent l() {
        return this.f4447j;
    }

    protected boolean m(boolean z10) {
        if (!K()) {
            return z10;
        }
        p();
        throw null;
    }

    protected int n(int i10) {
        if (!K()) {
            return i10;
        }
        p();
        throw null;
    }

    protected String o(String str) {
        if (!K()) {
            return str;
        }
        p();
        throw null;
    }

    public u4.a p() {
        return null;
    }

    public u4.b q() {
        return null;
    }

    public CharSequence r() {
        return s() != null ? s().a(this) : this.f4444g;
    }

    public final e s() {
        return this.E;
    }

    public CharSequence t() {
        return this.f4443f;
    }

    public String toString() {
        return i().toString();
    }

    public boolean u() {
        return !TextUtils.isEmpty(this.f4446i);
    }

    public boolean v() {
        return this.f4449l && this.f4454q && this.f4455r;
    }

    public boolean w() {
        return this.f4450m;
    }

    protected void x() {
        b bVar = this.C;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void y(boolean z10) {
        List<Preference> list = this.D;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).A(this, z10);
        }
    }

    protected void z() {
    }
}
