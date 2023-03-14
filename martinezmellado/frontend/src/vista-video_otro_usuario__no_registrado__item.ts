import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-video_otro_usuario__no_registrado__item')
export class VistaVideo_otro_usuario__no_registrado__item extends LitElement {
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
