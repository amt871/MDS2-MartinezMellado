import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-usuarionombreitem')
export class VistaUsuarionombreitem extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
 <vaadin-horizontal-layout style="align-items: center; justify-content: center; width: 100%; height: 95%;">
  <img id="imagen" style="width: 100%; height: 100%;">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="justify-content: center; align-items: center; height: 5%; width: 100%;">
  <label id="labelUsuario">Label</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
