package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f7701a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f7702b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f7703c = "com.amazon.venezia.command.SuccessResult";

        /* JADX INFO: renamed from: com.amazon.d.a.j$a$a, reason: collision with other inner class name */
        private static class C0170a implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f7704a;

            C0170a(IBinder iBinder) {
                this.f7704a = iBinder;
            }

            @Override // com.amazon.d.a.j
            public String a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f7703c);
                    this.f7704a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7704a;
            }

            @Override // com.amazon.d.a.j
            public Map b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f7703c);
                    this.f7704a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String c() {
                return a.f7703c;
            }
        }

        public a() {
            attachInterface(this, f7703c);
        }

        public static j a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f7703c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j)) ? new C0170a(iBinder) : (j) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface(f7703c);
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i10 != 2) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f7703c);
                return true;
            }
            parcel.enforceInterface(f7703c);
            Map mapB = b();
            parcel2.writeNoException();
            parcel2.writeMap(mapB);
            return true;
        }
    }

    String a();

    Map b();
}
