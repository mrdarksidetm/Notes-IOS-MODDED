package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f1227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1228b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f1230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutInflater f1231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1232f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1230d = z10;
        this.f1231e = layoutInflater;
        this.f1227a = eVar;
        this.f1232f = i10;
        a();
    }

    void a() {
        g gVarV = this.f1227a.v();
        if (gVarV != null) {
            ArrayList<g> arrayListZ = this.f1227a.z();
            int size = arrayListZ.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayListZ.get(i10) == gVarV) {
                    this.f1228b = i10;
                    return;
                }
            }
        }
        this.f1228b = -1;
    }

    public e b() {
        return this.f1227a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList<g> arrayListZ = this.f1230d ? this.f1227a.z() : this.f1227a.E();
        int i11 = this.f1228b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayListZ.get(i10);
    }

    public void d(boolean z10) {
        this.f1229c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> arrayListZ = this.f1230d ? this.f1227a.z() : this.f1227a.E();
        int i10 = this.f1228b;
        int size = arrayListZ.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1231e.inflate(this.f1232f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1227a.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f1229c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
