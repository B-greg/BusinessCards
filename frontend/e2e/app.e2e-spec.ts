import { BusinessCardPage } from './app.po';

describe('business-card App', () => {
  let page: BusinessCardPage;

  beforeEach(() => {
    page = new BusinessCardPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
