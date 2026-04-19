package df;

import ae.i0;
import ae.n0;
import ae.r;
import df.a;
import java.util.List;
import java.util.Map;
import we.h;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<he.c<?>, a> f10070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<he.c<?>, Map<he.c<?>, we.b<?>>> f10071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<he.c<?>, l<?, h<?>>> f10072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<he.c<?>, Map<String, we.b<?>>> f10073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<he.c<?>, l<String, we.a<?>>> f10074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Map<he.c<?>, ? extends a> map, Map<he.c<?>, ? extends Map<he.c<?>, ? extends we.b<?>>> map2, Map<he.c<?>, ? extends l<?, ? extends h<?>>> map3, Map<he.c<?>, ? extends Map<String, ? extends we.b<?>>> map4, Map<he.c<?>, ? extends l<? super String, ? extends we.a<?>>> map5) {
        super(null);
        r.f(map, "class2ContextualFactory");
        r.f(map2, "polyBase2Serializers");
        r.f(map3, "polyBase2DefaultSerializerProvider");
        r.f(map4, "polyBase2NamedSerializers");
        r.f(map5, "polyBase2DefaultDeserializerProvider");
        this.f10070a = map;
        this.f10071b = map2;
        this.f10072c = map3;
        this.f10073d = map4;
        this.f10074e = map5;
    }

    @Override // df.c
    public void a(e eVar) {
        r.f(eVar, "collector");
        for (Map.Entry<he.c<?>, a> entry : this.f10070a.entrySet()) {
            he.c<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C0233a) {
                r.d(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                we.b<?> bVarB = ((a.C0233a) value).b();
                r.d(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                eVar.d(key, bVarB);
            } else if (value instanceof a.b) {
                eVar.b(key, ((a.b) value).b());
            }
        }
        for (Map.Entry<he.c<?>, Map<he.c<?>, we.b<?>>> entry2 : this.f10071b.entrySet()) {
            he.c<?> key2 = entry2.getKey();
            for (Map.Entry<he.c<?>, we.b<?>> entry3 : entry2.getValue().entrySet()) {
                he.c<?> key3 = entry3.getKey();
                we.b<?> value2 = entry3.getValue();
                r.d(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                r.d(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                r.d(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                eVar.a(key2, key3, value2);
            }
        }
        for (Map.Entry<he.c<?>, l<?, h<?>>> entry4 : this.f10072c.entrySet()) {
            he.c<?> key4 = entry4.getKey();
            l<?, h<?>> value3 = entry4.getValue();
            r.d(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            r.d(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            eVar.c(key4, (l) n0.e(value3, 1));
        }
        for (Map.Entry<he.c<?>, l<String, we.a<?>>> entry5 : this.f10074e.entrySet()) {
            he.c<?> key5 = entry5.getKey();
            l<String, we.a<?>> value4 = entry5.getValue();
            r.d(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            r.d(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            eVar.e(key5, (l) n0.e(value4, 1));
        }
    }

    @Override // df.c
    public <T> we.b<T> b(he.c<T> cVar, List<? extends we.b<?>> list) {
        r.f(cVar, "kClass");
        r.f(list, "typeArgumentsSerializers");
        a aVar = this.f10070a.get(cVar);
        we.b<?> bVarA = aVar != null ? aVar.a(list) : null;
        if (bVarA instanceof we.b) {
            return (we.b<T>) bVarA;
        }
        return null;
    }

    @Override // df.c
    public <T> we.a<T> d(he.c<? super T> cVar, String str) {
        r.f(cVar, "baseClass");
        Map<String, we.b<?>> map = this.f10073d.get(cVar);
        we.b<?> bVar = map != null ? map.get(str) : null;
        if (!(bVar instanceof we.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        l<String, we.a<?>> lVar = this.f10074e.get(cVar);
        l<String, we.a<?>> lVar2 = n0.k(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (we.a) lVar2.invoke(str);
        }
        return null;
    }

    @Override // df.c
    public <T> h<T> e(he.c<? super T> cVar, T t10) {
        r.f(cVar, "baseClass");
        r.f(t10, "value");
        if (!cVar.c(t10)) {
            return null;
        }
        Map<he.c<?>, we.b<?>> map = this.f10071b.get(cVar);
        we.b<?> bVar = map != null ? map.get(i0.b(t10.getClass())) : null;
        if (!(bVar instanceof h)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        l<?, h<?>> lVar = this.f10072c.get(cVar);
        l<?, h<?>> lVar2 = n0.k(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (h) lVar2.invoke(t10);
        }
        return null;
    }
}
