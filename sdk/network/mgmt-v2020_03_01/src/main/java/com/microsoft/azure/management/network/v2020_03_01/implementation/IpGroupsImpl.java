/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_03_01.IpGroups;
import com.microsoft.azure.management.network.v2020_03_01.IpGroup;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class IpGroupsImpl extends GroupableResourcesCoreImpl<IpGroup, IpGroupImpl, IpGroupInner, IpGroupsInner, NetworkManager>  implements IpGroups {
    protected IpGroupsImpl(NetworkManager manager) {
        super(manager.inner().ipGroups(), manager);
    }

    @Override
    protected Observable<IpGroupInner> getInnerAsync(String resourceGroupName, String name) {
        IpGroupsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        IpGroupsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<IpGroup> listByResourceGroup(String resourceGroupName) {
        IpGroupsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<IpGroup> listByResourceGroupAsync(String resourceGroupName) {
        IpGroupsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<IpGroupInner>, Iterable<IpGroupInner>>() {
            @Override
            public Iterable<IpGroupInner> call(Page<IpGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IpGroupInner, IpGroup>() {
            @Override
            public IpGroup call(IpGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<IpGroup> list() {
        IpGroupsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<IpGroup> listAsync() {
        IpGroupsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<IpGroupInner>, Iterable<IpGroupInner>>() {
            @Override
            public Iterable<IpGroupInner> call(Page<IpGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IpGroupInner, IpGroup>() {
            @Override
            public IpGroup call(IpGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public IpGroupImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected IpGroupImpl wrapModel(IpGroupInner inner) {
        return  new IpGroupImpl(inner.name(), inner, manager());
    }

    @Override
    protected IpGroupImpl wrapModel(String name) {
        return new IpGroupImpl(name, new IpGroupInner(), this.manager());
    }

}
