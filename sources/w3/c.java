package w3;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LayoutInflater f22453k;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f22452j = i10;
        this.f22451i = i10;
        this.f22453k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // w3.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f22453k.inflate(this.f22452j, viewGroup, false);
    }

    @Override // w3.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f22453k.inflate(this.f22451i, viewGroup, false);
    }
}
