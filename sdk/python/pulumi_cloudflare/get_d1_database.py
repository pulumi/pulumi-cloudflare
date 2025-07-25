# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetD1DatabaseResult',
    'AwaitableGetD1DatabaseResult',
    'get_d1_database',
    'get_d1_database_output',
]

@pulumi.output_type
class GetD1DatabaseResult:
    """
    A collection of values returned by getD1Database.
    """
    def __init__(__self__, account_id=None, created_at=None, database_id=None, file_size=None, filter=None, id=None, name=None, num_tables=None, read_replication=None, uuid=None, version=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if database_id and not isinstance(database_id, str):
            raise TypeError("Expected argument 'database_id' to be a str")
        pulumi.set(__self__, "database_id", database_id)
        if file_size and not isinstance(file_size, float):
            raise TypeError("Expected argument 'file_size' to be a float")
        pulumi.set(__self__, "file_size", file_size)
        if filter and not isinstance(filter, dict):
            raise TypeError("Expected argument 'filter' to be a dict")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if num_tables and not isinstance(num_tables, float):
            raise TypeError("Expected argument 'num_tables' to be a float")
        pulumi.set(__self__, "num_tables", num_tables)
        if read_replication and not isinstance(read_replication, dict):
            raise TypeError("Expected argument 'read_replication' to be a dict")
        pulumi.set(__self__, "read_replication", read_replication)
        if uuid and not isinstance(uuid, str):
            raise TypeError("Expected argument 'uuid' to be a str")
        pulumi.set(__self__, "uuid", uuid)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        """
        Account identifier tag.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> _builtins.str:
        """
        Specifies the timestamp the resource was created as an ISO8601 string.
        """
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter(name="databaseId")
    def database_id(self) -> Optional[_builtins.str]:
        """
        D1 database identifier (UUID).
        """
        return pulumi.get(self, "database_id")

    @_builtins.property
    @pulumi.getter(name="fileSize")
    def file_size(self) -> _builtins.float:
        """
        The D1 database's size, in bytes.
        """
        return pulumi.get(self, "file_size")

    @_builtins.property
    @pulumi.getter
    def filter(self) -> Optional['outputs.GetD1DatabaseFilterResult']:
        return pulumi.get(self, "filter")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        D1 database identifier (UUID).
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        D1 database name.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="numTables")
    def num_tables(self) -> _builtins.float:
        return pulumi.get(self, "num_tables")

    @_builtins.property
    @pulumi.getter(name="readReplication")
    def read_replication(self) -> 'outputs.GetD1DatabaseReadReplicationResult':
        """
        Configuration for D1 read replication.
        """
        return pulumi.get(self, "read_replication")

    @_builtins.property
    @pulumi.getter
    def uuid(self) -> _builtins.str:
        """
        D1 database identifier (UUID).
        """
        return pulumi.get(self, "uuid")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.str:
        return pulumi.get(self, "version")


class AwaitableGetD1DatabaseResult(GetD1DatabaseResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetD1DatabaseResult(
            account_id=self.account_id,
            created_at=self.created_at,
            database_id=self.database_id,
            file_size=self.file_size,
            filter=self.filter,
            id=self.id,
            name=self.name,
            num_tables=self.num_tables,
            read_replication=self.read_replication,
            uuid=self.uuid,
            version=self.version)


def get_d1_database(account_id: Optional[_builtins.str] = None,
                    database_id: Optional[_builtins.str] = None,
                    filter: Optional[Union['GetD1DatabaseFilterArgs', 'GetD1DatabaseFilterArgsDict']] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetD1DatabaseResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_d1_database = cloudflare.get_d1_database(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        database_id="xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
    ```


    :param _builtins.str account_id: Account identifier tag.
    :param _builtins.str database_id: D1 database identifier (UUID).
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['databaseId'] = database_id
    __args__['filter'] = filter
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getD1Database:getD1Database', __args__, opts=opts, typ=GetD1DatabaseResult).value

    return AwaitableGetD1DatabaseResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        created_at=pulumi.get(__ret__, 'created_at'),
        database_id=pulumi.get(__ret__, 'database_id'),
        file_size=pulumi.get(__ret__, 'file_size'),
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        num_tables=pulumi.get(__ret__, 'num_tables'),
        read_replication=pulumi.get(__ret__, 'read_replication'),
        uuid=pulumi.get(__ret__, 'uuid'),
        version=pulumi.get(__ret__, 'version'))
def get_d1_database_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                           database_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           filter: Optional[pulumi.Input[Optional[Union['GetD1DatabaseFilterArgs', 'GetD1DatabaseFilterArgsDict']]]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetD1DatabaseResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_d1_database = cloudflare.get_d1_database(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        database_id="xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
    ```


    :param _builtins.str account_id: Account identifier tag.
    :param _builtins.str database_id: D1 database identifier (UUID).
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['databaseId'] = database_id
    __args__['filter'] = filter
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getD1Database:getD1Database', __args__, opts=opts, typ=GetD1DatabaseResult)
    return __ret__.apply(lambda __response__: GetD1DatabaseResult(
        account_id=pulumi.get(__response__, 'account_id'),
        created_at=pulumi.get(__response__, 'created_at'),
        database_id=pulumi.get(__response__, 'database_id'),
        file_size=pulumi.get(__response__, 'file_size'),
        filter=pulumi.get(__response__, 'filter'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        num_tables=pulumi.get(__response__, 'num_tables'),
        read_replication=pulumi.get(__response__, 'read_replication'),
        uuid=pulumi.get(__response__, 'uuid'),
        version=pulumi.get(__response__, 'version')))
