/*
 * Copyright (c) 2010-2014 Marand d.o.o. (www.marand.com)
 *
 * This file is part of Think!Med Clinical Medication Management.
 *
 * Think!Med Clinical Medication Management is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Think!Med Clinical Medication Management is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Think!Med Clinical Medication Management.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.marand.thinkmed.api.demographics.data;

import java.util.List;

import com.marand.thinkmed.api.core.data.EffectiveCatalogIdentity;

/**
 * @author Bostjan Vester
 */
public interface Country<N extends NutsRegion> extends EffectiveCatalogIdentity
{
  String getAlpha2Code();
  void setAlpha2Code(final String alpha2Code);
  String getAlpha3Code();
  void setAlpha3Code(final String alpha3Code);
  Boolean isEuMember();
  void setEuMember(final Boolean euMember);
  List<N> getNutsRegions();
  void setNutsRegions(final List<N> nutsRegions);
}
