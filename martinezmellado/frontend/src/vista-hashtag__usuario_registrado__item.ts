import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-hashtag__usuario_registrado__item')
export class VistaHashtag__usuario_registrado__item extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html``;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
