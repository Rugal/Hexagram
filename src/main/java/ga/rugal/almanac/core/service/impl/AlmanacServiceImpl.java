package ga.rugal.almanac.core.service.impl;

import ga.rugal.almanac.core.service.HexagramService;
import ga.rugal.almanac.core.service.LocaleService;
import ga.rugal.almanac.core.service.TranslationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlmanacServiceImpl {

  @Autowired
  private TranslationService translationService;

  @Autowired
  private HexagramService hexagramService;

  @Autowired
  private LocaleService localeService;
}