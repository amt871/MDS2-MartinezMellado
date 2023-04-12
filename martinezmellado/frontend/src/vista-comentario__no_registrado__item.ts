import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-comentario__no_registrado__item')
export class VistaComentario__no_registrado__item extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
 <img style="height: 90%;" src="../../resources/icons/user.svg">
 <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%; align-self: center; justify-content: center; align-items: center;">
  <label>Texto comentario </label>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
