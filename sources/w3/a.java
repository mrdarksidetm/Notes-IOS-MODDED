package w3;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import w3.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f22440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f22441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Cursor f22442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f22443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f22444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C0468a f22445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected DataSetObserver f22446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected w3.b f22447h;

    /* JADX INFO: renamed from: w3.a$a, reason: collision with other inner class name */
    private class C0468a extends ContentObserver {
        C0468a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.h();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f22440a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f22440a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        e(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // w3.b.a
    public Cursor b() {
        return this.f22442c;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i10) {
        b bVar;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f22441b = true;
        } else {
            this.f22441b = false;
        }
        boolean z10 = cursor != null;
        this.f22442c = cursor;
        this.f22440a = z10;
        this.f22443d = context;
        this.f22444e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f22445f = new C0468a();
            bVar = new b();
        } else {
            bVar = null;
            this.f22445f = null;
        }
        this.f22446g = bVar;
        if (z10) {
            C0468a c0468a = this.f22445f;
            if (c0468a != null) {
                cursor.registerContentObserver(c0468a);
            }
            DataSetObserver dataSetObserver = this.f22446g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f22440a || (cursor = this.f22442c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f22440a) {
            return null;
        }
        this.f22442c.moveToPosition(i10);
        if (view == null) {
            view = f(this.f22443d, this.f22442c, viewGroup);
        }
        d(view, this.f22443d, this.f22442c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f22447h == null) {
            this.f22447h = new w3.b(this);
        }
        return this.f22447h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f22440a || (cursor = this.f22442c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f22442c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f22440a && (cursor = this.f22442c) != null && cursor.moveToPosition(i10)) {
            return this.f22442c.getLong(this.f22444e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f22440a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f22442c.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f22443d, this.f22442c, viewGroup);
            }
            d(view, this.f22443d, this.f22442c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f22441b || (cursor = this.f22442c) == null || cursor.isClosed()) {
            return;
        }
        this.f22440a = this.f22442c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f22442c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0468a c0468a = this.f22445f;
            if (c0468a != null) {
                cursor2.unregisterContentObserver(c0468a);
            }
            DataSetObserver dataSetObserver = this.f22446g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f22442c = cursor;
        if (cursor != null) {
            C0468a c0468a2 = this.f22445f;
            if (c0468a2 != null) {
                cursor.registerContentObserver(c0468a2);
            }
            DataSetObserver dataSetObserver2 = this.f22446g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f22444e = cursor.getColumnIndexOrThrow("_id");
            this.f22440a = true;
            notifyDataSetChanged();
        } else {
            this.f22444e = -1;
            this.f22440a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
