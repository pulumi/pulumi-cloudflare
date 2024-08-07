// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class GetGatewayCategoriesCategoryResult
    {
        /// <summary>
        /// True if the category is in beta and subject to change.
        /// </summary>
        public readonly bool Beta;
        /// <summary>
        /// Which account types are allowed to create policies based on this category.
        /// </summary>
        public readonly string Class;
        /// <summary>
        /// A short summary of domains in the category.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The identifier for this category. There is only one category per ID.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// The name of the category.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A list of subcategories.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGatewayCategoriesCategorySubcategoryResult> Subcategories;

        [OutputConstructor]
        private GetGatewayCategoriesCategoryResult(
            bool beta,

            string @class,

            string description,

            int id,

            string name,

            ImmutableArray<Outputs.GetGatewayCategoriesCategorySubcategoryResult> subcategories)
        {
            Beta = beta;
            Class = @class;
            Description = description;
            Id = id;
            Name = name;
            Subcategories = subcategories;
        }
    }
}
